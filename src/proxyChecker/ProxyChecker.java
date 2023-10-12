package proxyChecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.*;

public class ProxyChecker {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("ip.txt");
            int i;
            String socketString = "";
            while ((i = fis.read()) != -1){
                if(i == 13){
                    continue;
                }else if (i == 10){
                    String ip = socketString.split(":")[0];
                    int port = Integer.parseInt(socketString.split(":")[1]);
                    //System.out.println("Проверяю ip: "+ip+" - port:"+port);
                    MyThread thread = new MyThread(ip, port);
                    thread.start();
                    socketString = "";
                }else if(i == 9){
                    socketString += ":";
                }else{
                    socketString += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
class MyThread extends Thread{
    private String ip;
    private int port;

    public MyThread(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        super.run();
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = con.getInputStream();
            System.out.println(ip+":"+port+" - Работает");
        } catch (Exception e) {
            System.out.println(ip+":"+port+" - НЕ РАБОТАЕТ!");
        }
    }
}
