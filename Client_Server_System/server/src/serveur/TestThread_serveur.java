package serveur;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TestThread_serveur {
    Socket obj;
    private BufferedReader fluxEntreeSocket;
    
public TestThread_serveur(String name,Socket obj){
   
    this.obj = obj;

}
public int[] chiffrement(String message){

 int[] alphabet_num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    
  char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
 int clé = 3;
 int[] ciphertext_num = new int[message.length()];
 for (int j = 0; j < message.length(); j++) {
            for (int k = 0; k < 26; k++) {
                
                if (message.charAt(j) == alphabet[k]) {
                    
                    ciphertext_num[j] = (alphabet_num[k] + clé) % 26; 
                    break;
                }

            }
        }


return ciphertext_num;

}
public void run(){
    try {
        for(int i = 0; i < 10; i++)
        
        fluxEntreeSocket = new BufferedReader(new InputStreamReader(obj.getInputStream()));
        System.out.println(fluxEntreeSocket.readLine());
               

    } catch (Exception e) {
    }


}

    
}
