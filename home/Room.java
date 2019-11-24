package house;

private class Room {

    public constructor  (String name, Int price, Int floor){
        this.name = name;
        this.price = price;
        this.floor = floor;
    }

    {
        this.dirt = 1;
        this.noise = 1;
        this.stink = 1;
        this.closeness = 1;
        this.bugs = 1;
        this.freshAir = 3;
    }

    void getProperty(String[] args){
        for (String property: args ){
            System.out.println("The " + property + "level is: " + this.invoke(property, null));
            Method method = carObj.getClass().getMethod(methodName);
            method.invoke(carObj);
        }
    }

    int getDirt() {
        return dirt;
    }

    void setDirt(int value){
        this.dirt = value;
    }


}