/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlon;

/**
 *
 * @author dangt
 */
public class Service {
    private String nameServices;

    public Service(String nameServices){
        this.nameServices=nameServices;
    }

    @Override
    public String toString() {
        return String.format("%s", this.nameServices);
    }

    /**
     * @return the nameServices
     */
    public String getNameServices() {
        return nameServices;
    }

    /**
     * @param nameServices the nameServices to set
     */
    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }
    
}
