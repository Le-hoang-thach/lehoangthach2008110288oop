package tuan3.buoi5;



public class Dog {
    //attribute
    //inplementation
    /*default*/ private int size;
    /*default*/ private String breed;
    /*default*/ private String name;

    //method
    //interface
    public void setSize(int size) {
        //trien khai rang buc nhat quan data here 
        if(size > 0){
            
            this.size = size;

        }else {
            System.out.println("Size kick co khong dc so am");
        }
        
    }
    public Dog(){

    }
    public Dog(int size ,String breed, String name){
            this.name = name;
            this.size = size;
            this.breed = breed;
    }
    public int getSize() {
        return this.size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return this.breed;
    }
    public String toString(){
        String str = name + breed + size;
        return str;
    }


}
