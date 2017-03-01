package retoprogramacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class RetoProgramacion
{
    public static int distance(String a, String b)
    {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] costs = new int[b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++)
        {
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++)
            {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]),
                        a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
 
    public static void main(String[] args)
    {
        String keyword="a", letra ="" ;
        int j=0;
        Scanner sc = new Scanner(System.in);
        String text = "CHILAQUILES TACOS TOSTADAS BURRITO REFRESCO TE SANDWICH MIGADA HOTDOG HAMBURGUESA";
        keyword = sc.nextLine();
        String[] pala = new String[5];
        while(!"END".equals(keyword)){
            letra="";
            String[] data = text.split(" ");
            List<Integer> dist = new ArrayList<Integer>();
            for (int i = 0; i < data.length; i++)
            {
                dist.add(distance(data[i], keyword));
            }
            Collections.sort(dist);
                for (int i = 0; i < data.length; i++)
                {
                    if (distance(data[i], keyword) == dist.get(0))
                    {
                        //System.out.print(data[i] + " " );
                        letra =( letra + data[i]);
                    
                    }
                }
                
            pala[j]=letra;
            //System.out.println(pala[j]);
            keyword = sc.nextLine();
            j=j+1;
        }
        int cont=0;
        for(int i=0; i<=4; i++)
        {
            if("CHILAQUILES".equals(pala[i]))
            {System.out.println(pala[i]+"   $35.00");cont=cont+35;}
            if("TACOS".equals(pala[i]))
            {System.out.println(pala[i]+"   $28.00");cont=cont+28;}
            if("TOSTADAS".equals(pala[i]))
            {System.out.println(pala[i]+"   $28.00");cont=cont+28;}
            if("BURRITO".equals(pala[i]))
            {System.out.println(pala[i]+"   $20.00");cont=cont+20;}
            if("REFRESCO".equals(pala[i]))
            {System.out.println(pala[i]+"   $10.00");cont=cont+10;}
            if("TE".equals(pala[i]))
            {System.out.println(pala[i]+"   $10.00");cont=cont+10;}
            if("SANDWICH".equals(pala[i]))
            {System.out.println(pala[i]+"   $10.00");cont=cont+10;}
            if("MIGADA".equals(pala[i]))
            {System.out.println(pala[i]+"   $28.00");cont=cont+28;}
            if("HOTDOG".equals(pala[i]))
            {System.out.println(pala[i]+"   $20.00");cont=cont+20;}
            if("HAMBURGUESA".equals(pala[i]))
            {System.out.println(pala[i]+"   $35.00");cont=cont+35;}
        }
        System.out.println("The total cost of the order, as follows\nYour total is: $"+cont);
        sc.close();
    }
}