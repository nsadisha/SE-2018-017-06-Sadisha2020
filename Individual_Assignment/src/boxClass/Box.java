package boxClass;

public class Box {
    private int L1;
    private int W1;
    private int H1;
    private int Weight;

    //constructor with no parameters
    public Box(){
        this.L1 = 0;
        this.W1 = 0;
        this.H1 = 0;
        this.Weight = 0;
    }
    //constructor with all parameters
    public Box(int L,int W, int H, int Weight){
        this.L1 = L;
        this.W1 = W;
        this.H1 = H;
        this.Weight = Weight;
    }

    //returns the volume
    public int calculateVolume(){
        return this.L1* this.W1* this.H1;
    }
    //returns the density
    public double calculateDensity(){
        int vol = this.calculateVolume();
        return this.Weight/ (double) vol;
    }

    //main
    public static void main(String[] args) {
        //creating the object
        Box box = new Box(10, 5, 5, 2600);

        //calculating volume and density
        int volume = box.calculateVolume();
        double density = box.calculateDensity();

        //output the volume and density
        System.out.println("Volume of the box: " + volume);
        System.out.println("Density of the box: " + density);

    }
}
