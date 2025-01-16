public class Alien {
    private int energyLevel;
    private int hostilityIndex;

    //STEP 3
    //Private
    public Alien (int energyLevel, int paramhostilityIndex){ //parameter
        this.energyLevel = energyLevel;
        this.hostilityIndex = paramhostilityIndex;
    }
        //Getter & Setter Methods
    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int paramEnergy){
        this.energyLevel = paramEnergy;
    }
    public int getHostilityIndex(){
        return hostilityIndex;
    }
    public void setHostilityIndex(int paramHostility){
        hostilityIndex = paramHostility;
       //or
    }
    public void printInfo(){
        System.out.println("Energy level: "  + energyLevel + ", Hostility Index: " + hostilityIndex);
    }


}
