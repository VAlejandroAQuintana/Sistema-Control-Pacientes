/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

public class ControladorReportePreesincripcion {
    
    
    controladorBD cb = new controladorBD();
    public String returnPac(String idPaciente, String id_receta, String rec_idcita){
        String newSql = "";
        if(!"".equals(idPaciente) || !"".equals(id_receta) || !"".equals(rec_idcita)){
            newSql = "SELECT * FROM tabla_recetas trc LEFT JOIN tabla_pacientes tpa ON tpa.id_paciente = trc.rec_idpaciente\n" +
            "LEFT JOIN tabla_citas tpc ON tpc.cm_idcita = '"+rec_idcita+"' LEFT JOIN tabla_unidadmedica tum ON tum.id_unidadmedica = trc.rec_idunidadmedica ";
            newSql += " WHERE id_paciente = '"+idPaciente+"' and rec_idreceta = '"+id_receta+"' and rec_idcita = '"+rec_idcita+"'";
        }
        System.out.println(newSql);
        /*
        
        SELECT * FROM bdconsultorio.tabla_recetas, bdconsultorio.tabla_pacientes, bdconsultorio.tabla_citas
        WHERE id_paciente="8894839" and rec_idreceta = 4121926 and rec_idcita = 4699725;
        
        */
        return newSql;
    }

}
