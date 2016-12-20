import java.util.Scanner;


public class leetcode8 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.print(atoi(str));
	}
	public static int atoi(String str){
		str = str.trim();   //ȥ���ַ�������Ŀո�
		//int a = Integer.parseInt(str);
		
		int len=str.length();
		if(len<1)
			return 0;
		
		int start=0;         
		boolean neg=false;       //�жϴ����Ÿ���
		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
            if (str.charAt(start) == '-')
                neg = true;
            start++;
        }
		
		
		int max = Integer.MAX_VALUE;
        int min = -Integer.MIN_VALUE;
        long result=0;
        for (int i =start; i<len; i++) {
            char ch = str.charAt(i);  //�ַ�������ַ�
            if (ch < '0' || ch > '9')
                break;
            result = 10*result+(ch - '0');
            if (!neg&&result > max)
                return max;
            if (neg&&-result < min)
                return min;
        }
		
        if (neg)
            result = -result;
		 return (int)result;
		
	}
	
}
