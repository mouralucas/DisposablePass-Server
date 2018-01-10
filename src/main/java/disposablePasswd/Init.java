package disposablePasswd;

import frames.Server;

/**
 *
 * @author Lucas Penha de Moura - 1208977
 */
public class Init {

    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        Hash h = new Hash();
//        String passwd;
//        System.out.println("Digite a senha");
//        passwd = in.next();
//        
//        System.out.println("A senha eh \n"
//                + passwd + " e a hash eh \n"
//                + h.pass2hash(passwd));

//        Calendar calendar = Calendar.getInstance();
//        int minute = calendar.get(Calendar.MINUTE);
//        String teste = "teste" + minute;
//        System.out.println(teste);
            Server s = new Server();
            s.setVisible(true);
    }
}
