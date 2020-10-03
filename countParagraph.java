import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
class countParagraph{
    int n;
    String para;
    countParagraph(int num){
        n=num;
        para="";
    }

    void input() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the paragraph");
        this.para=br.readLine();
    }

    int countSentences(){       //to count total number of words
        int count=0;
        for (int i=0; i<this.para.length(); i++){
            if(this.para.charAt(i)=='?' || this.para.charAt(i)=='.')
                count ++;
        }
        return count;
    }

    String[] spliting(){        //To splits words using - ' ', '.', '?' 
        StringTokenizer st=new StringTokenizer(this.para," ?,.");
        int noofwords = st.countTokens();
        String arrofstr[] = new String[noofwords];
        for(int i=0; st.hasMoreTokens(); i++)
            arrofstr[i] = st.nextToken();
        return arrofstr;   
    }
    
    int[] countFrequency(String arrayofwords[]){    //To count Frequency of each word
        int noofword=arrayofwords.length;
        int count =0;
        int arrfreq[]=new int[noofword];
        
        for (int i=0; i<noofword; i++)
        {
            count=1;
            for (int j=i+1;j<noofword; j++)
            {
                if(arrayofwords[i].equalsIgnoreCase(arrayofwords[j]))
                {
                    count++;
                    for (int k=j+1; k<noofword; k++)
                    {
                        arrayofwords[k-1]=arrayofwords[k];
                    }
                    noofword--;
                }
            }
            arrfreq[i]=count;
        }
        n=noofword;     //Now n stores number of words word one time only
        return arrfreq;
    }
    void sortPrint(String arrayWords[], int arrayFreq[]){   //To sort and print
        int len=n;      //Number of words
        for(int i=0; i<len; i++){
            int temp=i;
            for(int j=i+1; j<len; j++){
                if(arrayFreq[j]<arrayFreq[temp])
                    temp=j;
            }
            int tfreq=arrayFreq[temp];
            String twords=arrayWords[temp];
            arrayFreq[temp]=arrayFreq[i];
            arrayWords[temp]=arrayWords[i];
            arrayFreq[i]=tfreq;
            arrayWords[i]=twords;
        }
        
        //Printing it
        for(int i=0; i<len; i++)
            System.out.println(arrayWords[i]+'\t'+arrayFreq[i]);
    }
    
    public static void main(String agrs[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number of sentences-\t");
        int temp=sc.nextInt();
        countParagraph obj=new countParagraph(temp);
        obj.input();
        
        int c=obj.countSentences();
        if(c!=obj.n){
            System.out.printf("Invalid number of sentences\t", c);
            return;
        }
        String arrayWords[]=obj.spliting();
        int arrayFreq[]=obj.countFrequency(arrayWords);
        obj.sortPrint(arrayWords, arrayFreq);
    }
}