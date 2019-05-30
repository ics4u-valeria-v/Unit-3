
public class TowersOfHanoi {
	 //get the numbers of disks and the name of the rods
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
    	//if we have the disk assigned to number 1(smallest disk), write that you move the disk
        if (n == 1) 
        { 	//display that you're moving the disk from the road that is assigned to be the from_rod to the rod that is assigned to be to_rod
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod ); 
        } 
        //if it's not the top disk
        else
        {
        	//recall the function towerOfHanoi, but decrease the number of the disk and switch the aux an to rod
        	 towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        	 //display what disk you have moved from what rod to what rod
             System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod ); 
             //recall the function towerOfHanoi, but decrease the number of the disk 
             towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
        }
       
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n =5; // Number of disks 
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
    } 

}
