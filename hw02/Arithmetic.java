//  Robert Sullivan
//  CSE2
//  9/7/14

//  define a class
public class Arithmetic{
//  add main method
public static void main(String[] args){
// number of pairs of socks
    int nSocks=3;
// cost per pair of socks
    double sockCost$=2.58;
// number of drinking glasses
    int nGlasses=6;
// cost per glass
    double glassCost$=2.29;
// number of boxes of envelopes
    int nEnvelopes=1;
// clost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
// total cost of socks
    double totalSockCost$=nSocks*sockCost$;
// tax for socks   
    double taxSocks=totalSockCost$*taxPercent;
    
// total cost of glasses
    double totalGlassCost$=nGlasses*glassCost$;
// tax for glasses
    double taxGlasses=totalGlassCost$*taxPercent;
    
// total cost of envelopes
    double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
// tax for envelopes
    double taxEnvelopes=totalEnvelopeCost$*taxPercent;
    
// find the total before tax
    double totalCost1=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
// find the total tax
    double totalTax=taxSocks+taxGlasses+taxEnvelopes;
// overall total cost
    double totalCost2=totalCost1+totalTax;
// print out totals
System.out.println("Item: Pairs of Socks");
System.out.println("Quantity: "+nSocks);
System.out.println("Cost per item: $"+sockCost$);
System.out.println("Total cost(before tax): $"+totalSockCost$);
System.out.println("Tax: $"+taxSocks);
System.out.println("Item: Glasses");
System.out.println("Quantity: "+nGlasses);
System.out.println("Cost per item: $"+glassCost$);
System.out.println("Total cost(before tax): $"+totalGlassCost$);
System.out.println("Tax: $"+taxGlasses);
System.out.println("Item: Boxes of Envelopes");
System.out.println("Quantity: "+nEnvelopes);
System.out.println("Cost per item: $"+envelopeCost$);
System.out.println("Total cost(before tax): $"+totalEnvelopeCost$);
System.out.println("Tax: $"+taxEnvelopes);
System.out.println("");
System.out.println("Total value: $"+totalCost1);
System.out.println("Tax: $"+totalTax);
System.out.println("Total cost: $"+totalCost2);
    
    
} // close main method
} // close class