/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.ufps.plantilla.interf;

import java.ufps.plantilla.dto.usuarioDTO;

/**
 *
 * @author CESAR
 */
public interface IUsuarioDAO {
     public boolean login(usuarioDTO dto);
}
