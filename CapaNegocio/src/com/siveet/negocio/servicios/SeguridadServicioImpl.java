package com.siveet.negocio.servicios;

import com.siveet.negocio.servicios.common.SeguridadServicio;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

public class SeguridadServicioImpl extends ApplicationModuleImpl implements SeguridadServicio {

  public SeguridadServicioImpl() {
  }
  
  public Row buscarUsuario(String alias, String clave){
    Row rowUsuario = null;
    ViewObject voUsuario = findViewObject("EmpleadoVO");
    ViewCriteria vcAutenticacion = voUsuario.getViewCriteriaManager().getViewCriteria("AutenticacionVC");
    voUsuario.applyViewCriteria(vcAutenticacion);
    
    voUsuario.setNamedWhereClauseParam("bindAlias", alias);
    voUsuario.setNamedWhereClauseParam("bindClave", clave);
    voUsuario.executeQuery();
    
    Row rows[] = voUsuario.getAllRowsInRange();
    if(rows.length != 0){
     rowUsuario = rows[0];
    }
    return rowUsuario;
  }

  /**
   * Container's getter for EmpleadoVO.
   * @return EmpleadoVO
   */
  public ViewObjectImpl getEmpleadoVO() {
    return (ViewObjectImpl) findViewObject("EmpleadoVO");
  }
}
