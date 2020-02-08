package proj1;

public class NewYearGift extends SweetsWeight implements ChocolatesWeight{

	public int wc(int nc,int weight) {
		return(nc*weight);//n c-no.of chocolates
	
	}

	public static void main(String[] args) {
	
		int[] array=new int[3];//chocolate weight
		int total_gift_weight;
		
		
		SweetsWeight kaja=new SweetsWeight();
		ChocolatesWeight dairyMilk=new NewYearGift();
		array[0]=dairyMilk.wc(5,5);//w c-weight of chocolates
		total_gift_weight=array[0]+kaja.sweets_total_weight(5,30);
		
		System.out.println("Total weight of 1st gift is:"+total_gift_weight);
		
		SweetsWeight mothichur=new SweetsWeight();
		ChocolatesWeight fiveStar=new NewYearGift();
		array[1]=fiveStar.wc(5,5);//w c-weight of chocolates
		total_gift_weight=array[1]+mothichur.sweets_total_weight(20,5);
		
        System.out.println("Total weight of 2nd gift is:"+total_gift_weight);
                SweetsWeight berfi=new SweetsWeight();
		ChocolatesWeight munch=new NewYearGift();
		array[2]=munch.wc(5,5);//w c-weight of chocolates
		total_gift_weight=array[2]+berfi.sweets_total_weight(20,10);
		
		 System.out.println("Total weight of 3rd gift is:"+total_gift_weight);
		
        
        for(int i=0;i<array.length;i++)
        {
        	for(int j=i+1;j<array.length;j++)
        	{
        		if(array[i]>array[j])
        		{
        			int temp=array[i];
        			array[i]=array[j];
        			array[j]=temp;
        		}
        	}
        }
        System.out.println("displaying chocolates according to weight");
        for(int i=0;i<array.length;i++)
        {
        	System.out.print(array[i]+" ");
        }
        		
	}

	

	

}
