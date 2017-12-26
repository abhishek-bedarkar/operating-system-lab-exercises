package fcfs;

import java.util.Scanner;

public class Process {
	
	public static void main(String[] args) {
		
		int process_id[] = new int[20];// max 20 process 
		int brust_time[] = new int [20];
		int waiting_time[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("Enter no of processes");
		int n = sc.nextInt();
		int total=0;
		float avg;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter process ["+(i+1)+"] id :");
			process_id[i]=sc.nextInt();
			System.out.println("Enter process ["+(i+1)+"] burst time :");
			brust_time[i]=sc.nextInt();
		}
		waiting_time[0]=0;
		
		for(int i=1;i<n;i++) {
			waiting_time[i]=waiting_time[i-1]+brust_time[i-1];
			total+=waiting_time[i];
		}
		
		System.out.println("| process id |    burst time  |   waiting time |");
		for(int i=0;i<n;i++) {
			
			System.out.println("  "+process_id[i]+"\t\t\t"+brust_time[i]+"\t\t"+waiting_time[i]);
			
		}
		avg=(float)total/n;
		System.out.println("\n\nAverage waiting time :"+avg+" units.");
		
		System.out.println("\n\n----------------------------------");
		
		
	
		
		
	}

}
