package paquete1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    
    public static void main(String[] args) throws IOException{
        
        
        
        String nom;
        int cod;
        String desc;
        int stk;
        String pas;
        String est;
        String nte;
        String apell;
        String mail;
        String tlf;
        String calle;
        int num;
        int codp;
        String pobl;
        String pais;
        
        BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));
        // TODO Auto-generated method stub
        System.out.println("Que elemento quieres a�adir?");
        System.out.println("1.-Producto");
        System.out.println("2.-Cliente");
        System.out.println("3.-Pedido");
        
        int n = Integer.parseInt(reader.readLine());
        
        
        
        switch(n) {
            case 1:
                
                System.out.println("C�digo");
                
                cod = Integer.parseInt(reader.readLine());
                System.out.println("Nombre");
                
                nom = reader.readLine();
                System.out.println("Descripci�n");
                
                desc = reader.readLine();
                
                System.out.println("Stock");
                
                
                stk = Integer.parseInt(reader.readLine());
                System.out.println("Pasillo");
                
                pas = reader.readLine();
                System.out.println("Estanter�a");
                
                est = reader.readLine();
                System.out.println("Estante");
                
                nte = reader.readLine();
                
                
                System.out.println("Pendientes");
                boolean pendientes = Boolean.parseBoolean(reader.readLine());
                
                
                producto prod;
                localizacion loc;
                loc=new localizacion(pas,est,nte);
                prod=new producto(cod, nom,desc,stk,loc,pendientes);
                
                
                
                
                // code block
                break;
            case 2:
                
                
                
                System.out.println("Nombre");
                
                nom = reader.readLine();
                System.out.println("Apellidos");
                
                apell = reader.readLine();
                System.out.println("Email");
                
                mail = reader.readLine();
                
                
                System.out.println("Telefono");
                tlf = reader.readLine();
                
                System.out.println("Calle");
                
                
                calle = reader.readLine();
                
                System.out.println("Numero");
                
                
                num = Integer.parseInt(reader.readLine());
                
                
                System.out.println("Codigo postal");
                
                codp = Integer.parseInt(reader.readLine());
                System.out.println("Poblacion");
                
                pobl = reader.readLine();
                
                
                System.out.println("Pa�s");
                
                pais = reader.readLine();
                
                direccion dir;
                clientes client;
                dir=new direccion(calle,num,codp,pobl,pais);
                client=new clientes(nom,apell,mail,tlf,dir);
                //client=new producto(cod, nom,desc,stk,loc,pendientes);
                
                
                // code block
                break;
            case 3:
                
                
                
              
                break;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
