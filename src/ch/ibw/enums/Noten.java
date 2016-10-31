package ch.ibw.enums;

public enum Noten {
  C, CIS, D, DIS, E, F, FIS, G, GIS, A, AIS, H;
  
  public boolean liegtAufSchwarzerTaste() {
    switch (this) {
      case CIS: 
      case DIS: 
      case FIS: 
      case GIS: 
      case AIS:
        return true;
      default:
        return false;
    }
  }
}
