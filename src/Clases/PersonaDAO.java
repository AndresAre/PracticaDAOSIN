/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebas
 */
public class PersonaDAO implements DAO {
    private File archivo;
    
   

    public PersonaDAO() {
        this.archivo =Singleton.getInstance() ;
    }

    @Override
    public String registrarPersona(PersonaDTO user) {
        String salida = "";

        FileWriter archEscr;
        try {
            archEscr = new FileWriter(archivo,true);
            BufferedWriter bw = new BufferedWriter(archEscr);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(user.getNombre()+","+user.getApellido()+","+user.getTelefono()+"\n");
            salida = "Se creo un registro";
            bw.close();
            pw.close();
        } catch (IOException ex) {
            salida="No se pudo crear el registro";
        }
       
        return salida;
        
    }

    @Override
    public String actualizar(PersonaDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(PersonaDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonaDTO> ListarTodos() {
      List<PersonaDTO> personas=new ArrayList<>();
      String[] datos;    
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            System.out.println("DENTRO DEL ARCHIVO HAY LO SIGUIENTE : ");
            while ((linea=bf.readLine())!=null) {
                datos=linea.split(",");
                personas.add(new PersonaDTO(datos[0],datos[1],datos[2]));
            }
            
        }catch(IOException e){
            System.out.println("Se genero un error"+e.getMessage());
            
        }     
        return personas;
    }

    @Override
    public PersonaDTO listarById(PersonaDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
