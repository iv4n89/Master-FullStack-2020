package main;

public class Aeropuerto {
    private String name;
    private String city;
    private String country;
    private Company[] companies = new Company[10];
    private int numCompanies=0;

    public Aeropuerto(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public Aeropuerto(String name, String city, String country, Company[] companies) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.companies = companies;
        this.numCompanies=companies.length;
    }

    public void insertarCompany(Company company){
        companies[numCompanies]=company;
        numCompanies++;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public int getNumCompanies() {
        return numCompanies;
    }

    public Company getCompany(int index){
        return companies[index];
    }

    public Company getCompany(String name){
        boolean found=false;
        int i=0;
        Company company=null;
        while((!found)&&(i<companies.length)){
            if(name.equals(companies[i].getName())){
                company=companies[i];
                found=true;
            }
            i++;
        }
        return company;
    }
}
