package domain;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    public static final String VERSION = "1.0";
    private HashMap<String, Order> orders;
    private HashMap<String, Service> services;
    private ArrayList<Supplier> suppliers;
    private ArrayList<Location> locations;

    public Controller() {
        orders = new HashMap<String, Order>();
        services = new HashMap<String, Service>();
        suppliers = new ArrayList<Supplier>();
        locations = new ArrayList<Location>();
    }

    public Supplier getSupplier(String supplierID) {
        for (Supplier supplier : suppliers) {
            if (supplier.getId().equals(supplierID))
                return supplier;
        }
        return null;
    }

    public Location getLocation(String locationID) {
        for (Location location : locations) {
            if (location.getId().equals(locationID))
                return location;
        }
        return null;
    }

    public Order getOrder(String orderID) {
        return (orders.containsKey(orderID)) ? orders.get(orderID) : null;
    }

    public Service getService(String serviceID) {
        return (services.containsKey(serviceID)) ? services.get(serviceID) : null;
    }

    public String makeOrder(String staffID) {
        Order o = new Order(staffID);
        orders.put(o.getId(), o);
        return o.getId();
    }

    public void addItem(String orderID, String catalogID, String name, int quantity, double price, String description, String supplierID) {
        Order o = getOrder(orderID);
        Supplier s = getSupplier(supplierID);
        o.addItem(s, catalogID, name, quantity, price, description);
    }

    public void attachDocument(String orderID, File document) {
        Order o = getOrder(orderID);
        o.setDocument(document);
    }
    
    public void setOrderLocation(String orderID, String locationID) {
    	Order o = getOrder(orderID);
    	Location l = getLocation(locationID);
    	o.setLocation(l);
    }

    public Order completeOrder(String orderID) {
        return getOrder(orderID);
    }

    public void confirmOrder(String orderID) {
        Order o = getOrder(orderID);
        o.setDraft(false);
    }

    public String requestService(String staffID) {
        Service s = new Service(staffID);
        services.put(s.getId(), s);
        return s.getId();
    }

    public boolean enterServiceDetails(String serviceID, String name, String description, double estTime, String locationID) {
        Location l = getLocation(locationID);
        Service s = getService(serviceID);
        return s.setServiceDetails(name, description, estTime, l);
    }

    public Service editServiceDetails(String serviceID) {
        return getService(serviceID);
    }

    public void confirmServiceRequest(String serviceID) {
        Service s = getService(serviceID);
        s.setDraft(false);
    }

	public HashMap<String, Order> getOrders() {
		return orders;
	}

	public void setOrders(HashMap<String, Order> orders) {
		this.orders = orders;
	}

	public HashMap<String, Service> getServices() {
		return services;
	}

	public void setServices(HashMap<String, Service> services) {
		this.services = services;
	}

	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
}
