package com.siveet.presentacion.controlador;

public class MenuBean {
  private String taskFlowMostrado = "";
  public String mostrarFlujoGestionClientes() {
    this.taskFlowMostrado = "/WEB-INF/flujoRegistroIncidencia.xml#flujoRegistroIncidencia";
    return null;
  }
  public String mostrarFlujoGestionEmpleados() {
    this.taskFlowMostrado = "/WEB-INF/gestionarEmpleados.xml#gestionarEmpleados";
    return null;
  }
  public String mostrarFlujoGestionServicios() {
    this.taskFlowMostrado = "/WEB-INF/flujoRegistroIncidencia.xml#flujoRegistroIncidencia";
    return null;
  }
  public String mostrarFlujoGestionProductos() {
    this.taskFlowMostrado = "/WEB-INF/flujoRegistroIncidencia.xml#flujoRegistroIncidencia";
    return null;
  }
  public void setTaskFlowMostrado(String taskFlowMostrado) {
    this.taskFlowMostrado = taskFlowMostrado;
  }

  public String getTaskFlowMostrado() {
    return taskFlowMostrado;
  }
}