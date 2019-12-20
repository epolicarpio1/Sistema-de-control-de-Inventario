/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;



import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author spark
 */
public class Reporte {
    Connection cn;
    public Reporte(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:mysql://localhost/control_inventario","root","");
            
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
        public void mostrarReporte(){
            try{
            try{
            JasperReport reporte=JasperCompileManager.compileReport("general.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vista=new JasperViewer(print,false);
            vista.setTitle("REPORTE DE INVENTARIO");
            vista.setExtendedState(Frame.MAXIMIZED_BOTH);
            vista.setVisible(true);
            }
                
            catch(Exception e){
                
            }
            }
                
            catch(Exception e){
                
            }
        }
         public void mostrarReporteE(){
            try{
            try{
            JasperReport reporte=JasperCompileManager.compileReport("especificaciones.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vista=new JasperViewer(print,false);
            vista.setTitle("REPORTE DE INVENTARIO");
            vista.setExtendedState(Frame.MAXIMIZED_BOTH);
            vista.setVisible(true);
            }
                
            catch(Exception e){
                
            }
            }
                
            catch(Exception e){
                
            }
        }

    }


    

