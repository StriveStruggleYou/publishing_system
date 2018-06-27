package org.ssy.publish.web.vo;

import com.github.abel533.echarts.Option;

public class NewOption extends Option {

  private String coordinateSystem="cartesian2d";


  public String getCoordinateSystem() {
    return coordinateSystem;
  }

  public void setCoordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }
}
