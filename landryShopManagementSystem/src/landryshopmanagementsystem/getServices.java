/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package landryshopmanagementsystem;

import java.sql.Date;

/**
 *
 * @author User
 */
public class getServices {

    private Integer id;
    private String serviceID;
    private String clothType;
    private String service;
    private Double pricePerKilo;
    private String image;
    private Date date;
    private Date uDate;
    private Integer kilo;

    public getServices(Integer id, String serviceID, String clothType,
            String service, Double pricePerKilo, String image, Date date, Date uDate) {
        this.id = id;
        this.serviceID = serviceID;
        this.clothType = clothType;
        this.service = service;
        this.pricePerKilo = pricePerKilo;
        this.image = image;
        this.date = date;
        this.uDate = uDate;
    }

    public getServices(Integer id, String clothType, String service, Double pricePerKilo, String image) {
        this.clothType = clothType;
        this.id = id;
        this.service = service;
        this.pricePerKilo = pricePerKilo;
        this.image = image;
    }

    public getServices(Integer id, String clothType, String service, Integer kilo, Double pricePerKilo, String image, Date date) {
        this.clothType = clothType;
        this.id = id;
        this.service = service;
        this.pricePerKilo = pricePerKilo;
        this.image = image;
        this.kilo = kilo;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getServiceID() {
        return serviceID;
    }

    public String getClothType() {
        return clothType;
    }

    public String getService() {
        return service;
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public String getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }

    public Date getUDate() {
        return uDate;
    }

    public Integer getKilo() {
        return kilo;
    }
}
