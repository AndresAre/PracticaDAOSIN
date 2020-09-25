/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface DAO {
    public String registrarPersona(PersonaDTO user);
    public String actualizar(PersonaDTO user);
    public String eliminar(PersonaDTO user);
    public List<PersonaDTO>ListarTodos();
    public PersonaDTO listarById(PersonaDTO user);
    
}
