//Building Standard Calculator
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
//Building Programmer Calculator
class ProgrammerCalculator{
    static String expression="";
    void programmer_calculator(){
        Frame f=new Frame();
        f.setTitle("Programmer Calculator");
        TextField tf=new TextField();
        Font font1 = new Font(Font.SERIF, Font.BOLD, 16);
        tf.setFont(font1);
        Button b1=new Button("&");
        Button b2=new Button("|");
        Button b3=new Button("~");
        Button b4=new Button("^");
        
        Button b5=new Button(">>");
        Button b6=new Button("<<");
        Button b7=new Button("Check Prime");
        Button b8=new Button("Check Perfect");
        
        Button b9=new Button("7");
        Button b10=new Button("8");
        Button b11=new Button("9");
        Button b12=new Button("n!");
        
        Button b13=new Button("4");
        Button b14=new Button("5");
        Button b15=new Button("6");
        Button b16=new Button("Factor");
        
        Button b17=new Button("1");
        Button b18=new Button("2");
        Button b19=new Button("3");
        Button b20=new Button("=");
        
        Button b21=new Button("0");
        Button b22=new Button(".");
        Button b23=new Button("gcd(a,b)");
        Button b24=new Button("lcm(a,b)");
        
        Button b25=new Button("bin(x)");
        Button b26=new Button("oct(x)");
        Button b27=new Button("hex(x)");
        Button b28=new Button("C");
        
        
        //Adding event listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="&";
                tf.setText(expression);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="|";
                tf.setText(expression);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="~";
                tf.setText(expression);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="^";
                tf.setText(expression);
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+=">>";
                tf.setText(expression);
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="<<";
                tf.setText(expression);
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                check_prime(expression);
                tf.setText(expression);
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                check_perfect(expression);
                tf.setText(expression);
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="7";
                tf.setText(expression);
            }
        });
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="8";
                tf.setText(expression);
            }
        });
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="9";
                tf.setText(expression);
            }
        });
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_factorial(expression);
                tf.setText(expression);
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="4";
                tf.setText(expression);
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="5";
                tf.setText(expression);
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="6";
                tf.setText(expression);
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display_factors(expression);
                tf.setText(expression);
            }
        });
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="1";
                tf.setText(expression);
            }
        });
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="2";
                tf.setText(expression);
            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="3";
                tf.setText(expression);
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                evaluate_expression(expression);
                tf.setText(expression);
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="0";
                tf.setText(expression);
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+=".";
                tf.setText(expression);
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_gcd(tf.getText());
                tf.setText(expression);
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_lcm(tf.getText());
                tf.setText(expression);
            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_binary(expression);
                tf.setText(expression);
            }
        });
        b26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_octal(expression);
                tf.setText(expression);
            }
        });
        b27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_hexadecimal(expression);
                tf.setText(expression);
            }
        });
        b28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression="";
                tf.setText(expression);
            }
        });
        /*Setting the position of each components in the frame using x and y
        coordinate and also setting the geometry of each component i.e. width
        and height.
        */
        
        tf.setBounds(20,40,300,60);
        b1.setBounds(10,105,80,45);
        b2.setBounds(90,105,80,45);
        b3.setBounds(170,105,80,45);
        b4.setBounds(250,105,80,45);
        
        b5.setBounds(10,150,80,45);
        b6.setBounds(90,150,80,45);
        b7.setBounds(170,150,80,45);
        b8.setBounds(250,150,80,45);
        
        b9.setBounds(10,195,80,45);
        b10.setBounds(90,195,80,45);
        b11.setBounds(170,195,80,45);
        b12.setBounds(250,195,80,45);
        
        b13.setBounds(10,240,80,45);
        b14.setBounds(90,240,80,45);
        b15.setBounds(170,240,80,45);
        b16.setBounds(250,240,80,45);
        
        b17.setBounds(10,285,80,45);
        b18.setBounds(90,285,80,45);
        b19.setBounds(170,285,80,45);
        b20.setBounds(250,285,80,45);
        
        b21.setBounds(10,330,80,45);
        b22.setBounds(90,330,80,45);
        b23.setBounds(170,330,80,45);
        b24.setBounds(250,330,80,45);
        
        b25.setBounds(10,375,80,45);
        b26.setBounds(90,375,80,45);
        b27.setBounds(170,375,80,45);
        b28.setBounds(250,375,80,45);
        
        //Adding the components to the frames.
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b24);
        f.add(b25);
        f.add(b26);
        f.add(b27);
        f.add(b28);
        f.add(tf);   
        
        
        //To change the size of each component if not then the components will occupy all the spaces in th frame
        f.setLayout(null);
        //Setting the size
        f.setSize(340,430);
        //Set the visibility on
        f.setVisible(true);
    }  
    static void check_prime(String exp){
        int num=Integer.parseInt(exp);
        String val="";
        int ctr=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                ctr++;
        }
        if(ctr==2)
            val=expression+" is a Prime Number";
        else
            val=expression+" is not a Prime Number";
        expression=val;
    }
    static void check_perfect(String exp){
        int num=Integer.parseInt(exp);
        String val="";
        int sfact=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sfact+=i;
        }
        if(sfact==num)
            val=expression+" is a Perfect Number";
        else
            val=expression+" is not a Perfect Number";
        expression=val;
    }
    static void evaluate_expression(String exp){
        if(exp.contains("<<")){
            int p=exp.indexOf('<');
            int a=Integer.parseInt(exp.substring(0,p));
            int b=Integer.parseInt(exp.substring(p+2));
            int res=a<<b;
            expression=String.valueOf(res);
            return;
        }
        if(exp.contains(">>")){
            int p=exp.indexOf('>');
            int a=Integer.parseInt(exp.substring(0,p));
            int b=Integer.parseInt(exp.substring(p+2));
            int res=a>>b;
            expression=String.valueOf(res);
            return;
        }
        int i=0;
        for(i=0;i<exp.length();i++){
            if(!(exp.charAt(i)>=48 && exp.charAt(i)<=57))
                break;
        }
        int num1=Integer.parseInt(exp.substring(0,i));
        int num2=Integer.parseInt(exp.substring(i+1));
        char operator=exp.charAt(i);
        int val=0;
        switch(operator){
            case '&':
                val=num1 & num2;
                expression=String.valueOf(val);
                break;
            case '|':
                val=num1 | num2;
                expression=String.valueOf(val);
                break;
            case '^':
                val=num1 ^ num2;
                expression=String.valueOf(val);
                break;
            default:
                expression="Syntax Error: Invalid Operation";
        }
    }
    static void calc_factorial(String exp){
        int num=Integer.parseInt(exp);
        long fact=1;
        for(int i=1;i<=num;i++)
            fact*=i;
        expression=String.valueOf(fact);
    }
    static void display_factors(String exp){
        int num=Integer.parseInt(exp);
        String factors="";
        for(int i=1;i<=num;i++){
            if(num%i==0)
                factors+=String.valueOf(i)+" ";
        }
        expression=factors;
    }
    static void calc_gcd(String exp){
        int p=exp.indexOf(' ');
        int num1=Integer.parseInt(exp.substring(0,p));
        int num2=Integer.parseInt(exp.substring(p+1));
        int gcd=1;
        for(int i=1;i<=Math.min(num1, num2);i++){
            if(num1%i==0 && num2%i==0)
                gcd=i;
        }
        expression="GCD of "+String.valueOf(num1)+" and "+String.valueOf(num2)+" is:- "+String.valueOf(gcd);
    }
    static void calc_lcm(String exp){
        int p=exp.indexOf(' ');
        int num1=Integer.parseInt(exp.substring(0,p));
        int num2=Integer.parseInt(exp.substring(p+1));
        int gcd=1;
        for(int i=1;i<=Math.min(num1, num2);i++){
            if(num1%i==0 && num2%i==0)
                gcd=i;
        }
        int lcm=(num1*num2)/gcd;
        expression="LCM of "+String.valueOf(num1)+" and "+String.valueOf(num2)+" is:- "+String.valueOf(lcm);
    }
    static void calc_binary(String exp){
        int num=Integer.parseInt(exp);
        String binary=Integer.toBinaryString(num);
        expression=binary;
    }
    static void calc_octal(String exp){
        int num=Integer.parseInt(exp);
        String octal=Integer.toOctalString(num);
        expression=octal;
    }
    static void calc_hexadecimal(String exp){
        int num=Integer.parseInt(exp);
        String hexadecimal=Integer.toHexString(num);
        expression=hexadecimal.toUpperCase();
    }
}
//Building Scientific Calculator
class ScientificCalculator{
    static String expression="";
    void scientific_calculator(){
        Frame f=new Frame();
        f.setTitle("Scientific Calculator");
        TextField tf=new TextField();
        Font font1 = new Font(Font.SERIF, Font.BOLD, 16);
        tf.setFont(font1);
        Button b1=new Button("c");
        Button b2=new Button("π");
        Button b3=new Button("e");
        Button b4=new Button("C");
        Button b5=new Button("<-");
        
        Button b6=new Button("x^2");
        Button b7=new Button("1/x");
        Button b8=new Button("|x|");
        Button b9=new Button("%");
        Button b10=new Button("mod");
        
        Button b11=new Button("√x");
        Button b12=new Button("(");
        Button b13=new Button(")");
        Button b14=new Button("n!");
        Button b15=new Button("÷");
        
        Button b16=new Button("x^y");
        Button b17=new Button("7");
        Button b18=new Button("8");
        Button b19=new Button("9");
        Button b20=new Button("*");
        
        Button b21=new Button("10^x");
        Button b22=new Button("4");
        Button b23=new Button("5");
        Button b24=new Button("6");
        Button b25=new Button("-");
        
        Button b26=new Button("log x");
        Button b27=new Button("1");
        Button b28=new Button("2");
        Button b29=new Button("3");
        Button b30=new Button("+");
        
        Button b31=new Button("ln");
        Button b32=new Button("+/-");
        Button b33=new Button("0");
        Button b34=new Button(".");
        Button b35=new Button("=");
        
        Button b36=new Button("sin(x)");
        Button b37=new Button("cos(x)");
        Button b38=new Button("tan(x)");
        Button b39=new Button("Πr^2");
        Button b40=new Button("2Πr");
        
        
        //Adding event listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="300000000";
                tf.setText(expression);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="3.14";
                tf.setText(expression);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="2.7182";
                tf.setText(expression);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression="";
                tf.setText(expression);
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression=expression.substring(0,expression.length()-1);
                tf.setText(expression);
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_square(expression);
                tf.setText(expression);
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_reciprocal(expression);
                tf.setText(expression);
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_absolute(expression);
                tf.setText(expression);
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="%";
                tf.setText(expression);
            }
        });
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="mod";
                tf.setText(expression);
            }
        });
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_root(expression);
                tf.setText(expression);
            }
        });
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="(";
                tf.setText(expression);
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+=")";
                tf.setText(expression);
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_factorial(expression);
                tf.setText(expression);
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="÷";
                tf.setText(expression);
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="^";
                tf.setText(expression);
            }
        });
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="7";
                tf.setText(expression);
            }
        });
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="8";
                tf.setText(expression);
            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="9";
                tf.setText(expression);
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="*";
                tf.setText(expression);
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_power_10(expression);
                tf.setText(expression);
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="4";
                tf.setText(expression);
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="5";
                tf.setText(expression);
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="6";
                tf.setText(expression);
            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="-";
                tf.setText(expression);
            }
        });
        b26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_log_10(expression);
                tf.setText(expression);
            }
        });
        b27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="1";
                tf.setText(expression);
            }
        });
        b28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="2";
                tf.setText(expression);
            }
        });
        b29.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="3";
                tf.setText(expression);
            }
        });
        b30.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="+";
                tf.setText(expression);
            }
        });
        b31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_log_e(expression);
                tf.setText(expression);
            }
        });
        b32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                negate_value(expression);
                tf.setText(expression);
            }
        });
        b33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="0";
                tf.setText(expression);
            }
        });
        b34.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+=".";
                tf.setText(expression);
            }
        });
        b35.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                evaluate_expression(expression);
                tf.setText(expression);
            }
        });
        b36.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_sin(expression);
                tf.setText(expression);
            }
        });
        b37.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_cos(expression);
                tf.setText(expression);
            }
        });
        b38.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_tan(expression);
                tf.setText(expression);
            }
        });
        b39.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_area(expression);
                tf.setText(expression);
            }
        });
        b40.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_perimeter(expression);
                tf.setText(expression);
            }
        });
        
        
        
        
        /*Setting the position of each components in the frame using x and y
        coordinate and also setting the geometry of each component i.e. width
        and height.
        */
        
        tf.setBounds(20,40,375,60);
        b1.setBounds(10,105,80,45);
        b2.setBounds(90,105,80,45);
        b3.setBounds(170,105,80,45);
        b4.setBounds(250,105,80,45);
        b5.setBounds(330,105,80,45);
        
        b6.setBounds(10,150,80,45);
        b7.setBounds(90,150,80,45);
        b8.setBounds(170,150,80,45);
        b9.setBounds(250,150,80,45);
        b10.setBounds(330,150,80,45);
        
        b11.setBounds(10,195,80,45);
        b12.setBounds(90,195,80,45);
        b13.setBounds(170,195,80,45);
        b14.setBounds(250,195,80,45);
        b15.setBounds(330,195,80,45);
        
        b16.setBounds(10,240,80,45);
        b17.setBounds(90,240,80,45);
        b18.setBounds(170,240,80,45);
        b19.setBounds(250,240,80,45);
        b20.setBounds(330,240,80,45);
        
        b21.setBounds(10,285,80,45);
        b22.setBounds(90,285,80,45);
        b23.setBounds(170,285,80,45);
        b24.setBounds(250,285,80,45);
        b25.setBounds(330,285,80,45);
        
        b26.setBounds(10,330,80,45);
        b27.setBounds(90,330,80,45);
        b28.setBounds(170,330,80,45);
        b29.setBounds(250,330,80,45);
        b30.setBounds(330,330,80,45);
        
        b31.setBounds(10,375,80,45);
        b32.setBounds(90,375,80,45);
        b33.setBounds(170,375,80,45);
        b34.setBounds(250,375,80,45);
        b35.setBounds(330,375,80,45);
        
        b36.setBounds(10,420,80,45);
        b37.setBounds(90,420,80,45);
        b38.setBounds(170,420,80,45);
        b39.setBounds(250,420,80,45);
        b40.setBounds(330,420,80,45);
        
        
        //Adding the components to the frames.
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b24);
        f.add(b25);
        f.add(b26);
        f.add(b27);
        f.add(b28);
        f.add(b29);
        f.add(b30);
        f.add(b31);
        f.add(b32);
        f.add(b33);
        f.add(b34);
        f.add(b35);
        f.add(b36);
        f.add(b37);
        f.add(b38);
        f.add(b39);
        f.add(b40);
        f.add(tf);   
        
        
        //To change the size of each component if not then the components will occupy all the spaces in th frame
        f.setLayout(null);
        //Setting the size
        f.setSize(423,475);
        //Set the visibility on
        f.setVisible(true);
    }  
    static void calc_perimeter(String exp){
        double r=Double.parseDouble(exp);
        double area=Math.PI*Math.pow(r,2);
        expression="Area of circle is:- "+String.valueOf(area);
    }
    static void calc_area(String exp){
        double r=Double.parseDouble(exp);
        double peri=2*Math.PI*r;
        expression="Perimeter of circle is:- "+String.valueOf(peri);
    }
    static void calc_tan(String exp){
        double val=Double.parseDouble(exp);
        double tan_value=Math.tan(val);
        expression="tan("+exp+")="+String.valueOf(tan_value);
    }
    static void calc_cos(String exp){
        double val=Double.parseDouble(exp);
        double tan_value=Math.cos(val);
        expression="cos("+exp+")="+String.valueOf(tan_value);
    }
    static void calc_sin(String exp){
        double val=Double.parseDouble(exp);
        double tan_value=Math.sin(val);
        expression="sin("+exp+")="+String.valueOf(tan_value);
    }
    static void negate_value(String exp){
        int x=Integer.parseInt(exp);
        x*=-1;
        expression=String.valueOf(x);
    }
    static void calc_log_10(String exp){
        double x=Double.parseDouble(exp);
        double res=Math.log10(x);
        expression=String.valueOf(res);
    }
    static void calc_log_e(String exp){
        double x=Double.parseDouble(exp);
        double res=Math.log(x);
        expression=String.valueOf(res);
    }
    static void calc_power_10(String exp){
        double x=Double.parseDouble(exp);
        double res=Math.pow(10,x);
        expression=String.valueOf(res);
    }
    static void calc_factorial(String exp){
        int num=Integer.parseInt(exp);
        long fact=1;
        for(int i=1;i<=num;i++)
            fact*=i;
        expression=String.valueOf(fact);
    }
    static void calc_reciprocal(String exp){
        int x=Integer.parseInt(exp);
        double res=(double)1/x;
        expression=String.valueOf(res);
    }
    static void calc_root(String exp){
        int x=Integer.parseInt(exp);
        double res=Math.sqrt(x);
        expression=String.valueOf(res);
    }
    static void calc_square(String exp){
        double x=Double.parseDouble(exp);
        double res=Math.pow(x,2);
        expression=String.valueOf(res);
    }
    static void calc_absolute(String exp){
        double x=Double.parseDouble(exp);
        double res=Math.abs(x);
        expression=String.valueOf(res);
    }
    static int priority(char op){
        if(op=='^' || op=='$')
            return 3;
        else if(op=='÷' || op=='/' || op=='*')
            return 2;
        else if(op=='+' || op=='-')
            return 1;
        else
            return -1;
    }
    static String convert(String exp){
        String ans="";
        Stack<Character> st= new Stack<Character>();
        for (int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if (Character.isDigit(ch))
                ans+=ch;
            else if(ch == '(')
                st.push(ch);
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='(') {
                    ans+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    static int evaluate_postfix(String postfix){
        int ans=0;
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            if(Character.isDigit(ch))
                st.push(ch-48);
            else{
                int num1=st.pop();
                int num2=st.pop();
                if(ch=='+')
                    ans=num2+num1;
                else if(ch=='-')
                    ans=num2-num1;
                else if(ch=='*')
                    ans=num2*num1;
                else if(ch=='÷')
                    ans=num2/num1;
                st.push(ans);
            }
        }
        return st.peek();
    }
    static void evaluate_expression(String exp){
        if(exp.contains("mod")){
            int p=exp.indexOf('m');
            int num1=Integer.parseInt(exp.substring(0,p));
            int num2=Integer.parseInt(exp.substring(p+3));
            int res=num1%num2;
            expression=String.valueOf(res);
            return;
        }
        if(exp.contains("%")){
            int p=exp.indexOf('%');
            int num1=Integer.parseInt(exp.substring(0,p));
            int num2=Integer.parseInt(exp.substring(p+1));
            double res=(double)(num1*num2)/100;
            expression=String.valueOf(res);
            return;
        }
        if(exp.contains("^")){
            int p=exp.indexOf('^');
            int num1=Integer.parseInt(exp.substring(0,p));
            int num2=Integer.parseInt(exp.substring(p+1));
            double res=Math.pow(num1,num2);
            expression=String.valueOf(res);
            return;
        }
        String postfix=convert(exp);
        int res=evaluate_postfix(postfix);
        expression=String.valueOf(res);
    }
}
class StandardCalculator{
    static String expression="";
    void standard_calculator(){
        Frame f=new Frame();
        f.setTitle("Standard Calculator");
        TextField tf=new TextField();
        Font font1 = new Font(Font.SERIF, Font.BOLD, 16);
        tf.setFont(font1);
        Button b1=new Button("%");  
        Button b2=new Button("CE");
        Button b3=new Button("C");
        Button b4=new Button("<-");
        
        Button b5=new Button("1/x");
        Button b6=new Button("x^2");
        Button b7=new Button("√x");
        Button b8=new Button("÷");
        
        Button b9=new Button("7");
        Button b10=new Button("8");
        Button b11=new Button("9");
        Button b12=new Button("*");
        
        Button b13=new Button("4");
        Button b14=new Button("5");
        Button b15=new Button("6");
        Button b16=new Button("-");
        
        Button b17=new Button("1");
        Button b18=new Button("2");
        Button b19=new Button("3");
        Button b20=new Button("+");
        
        Button b21=new Button("+/-");
        Button b22=new Button("0");
        Button b23=new Button(".");
        Button b24=new Button("=");
        
        
        //Adding the event listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="%";
                tf.setText(expression);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression="";
                tf.setText(expression);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression="";
                tf.setText(expression);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression=expression.substring(0,expression.length()-1);
                tf.setText(expression);
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                evaluate_reciprocal(expression);
                tf.setText(expression);
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calc_square(expression);
                tf.setText(expression);
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                evaluate_root(expression);
                tf.setText(expression);
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="÷";
                tf.setText(expression);
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="7";
                tf.setText(expression);
            }
        });
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="8";
                tf.setText(expression);
            }
        });
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="9";
                tf.setText(expression);
            }
        });
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="*";
                tf.setText(expression);
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="4";
                tf.setText(expression);
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="5";
                tf.setText(expression);
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="6";
                tf.setText(expression);
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="-";
                tf.setText(expression);
            }
        });
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="1";
                tf.setText(expression);
            }
        });
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="2";
                tf.setText(expression);
            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="3";
                tf.setText(expression);
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="+";
                tf.setText(expression);
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                change_sign(expression);
                tf.setText(expression);
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+="0";
                tf.setText(expression);
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                expression+=".";
                tf.setText(expression);
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                evaluate_expression(expression);
                tf.setText(expression);
            }
        });
        /*Setting the position of each components in the frame using x and y
        coordinate and also setting the geometry of each component i.e. width
        and height.
        */
        
        tf.setBounds(20,40,300,60);
        b1.setBounds(10,105,80,45);
        b2.setBounds(90,105,80,45);
        b3.setBounds(170,105,80,45);
        b4.setBounds(250,105,80,45);
        
        b5.setBounds(10,150,80,45);
        b6.setBounds(90,150,80,45);
        b7.setBounds(170,150,80,45);
        b8.setBounds(250,150,80,45);
        
        b9.setBounds(10,195,80,45);
        b10.setBounds(90,195,80,45);
        b11.setBounds(170,195,80,45);
        b12.setBounds(250,195,80,45);
        
        b13.setBounds(10,240,80,45);
        b14.setBounds(90,240,80,45);
        b15.setBounds(170,240,80,45);
        b16.setBounds(250,240,80,45);
        
        b17.setBounds(10,285,80,45);
        b18.setBounds(90,285,80,45);
        b19.setBounds(170,285,80,45);
        b20.setBounds(250,285,80,45);
        
        b21.setBounds(10,330,80,45);
        b22.setBounds(90,330,80,45);
        b23.setBounds(170,330,80,45);
        b24.setBounds(250,330,80,45);
        
        
        //Adding the components to the frames.
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b24);
        f.add(tf);   
        
        
        //To change the size of each component if not then the components will occupy all the spaces in th frame
        f.setLayout(null);
        //Setting the size
        f.setSize(340,385);
        //Set the visibility on
        f.setVisible(true);
    }  
    static void change_sign(String exp){
        if(exp.charAt(0)=='-')
            exp=exp.substring(1);
        else
            exp="-"+exp;
        expression=exp;
    }
    static void calc_square(String exp){
        double x=Double.parseDouble(exp);
        double r=x*x;
        expression=String.valueOf(r);
    }
    static int priority(char op){
        if(op=='^' || op=='$')
            return 3;
        else if(op=='÷' || op=='/' || op=='*')
            return 2;
        else if(op=='+' || op=='-')
            return 1;
        else
            return -1;
    }
    static String convert(String exp){
        String ans="";
        Stack<Character> st= new Stack<Character>();
        for (int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if (Character.isDigit(ch))
                ans+=ch;
            else if(ch == '(')
                st.push(ch);
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='(') {
                    ans+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    static int evaluate_postfix(String postfix){
        int ans=0;
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            if(Character.isDigit(ch))
                st.push(ch-48);
            else{
                int num1=st.pop();
                int num2=st.pop();
                if(ch=='+')
                    ans=num2+num1;
                else if(ch=='-')
                    ans=num2-num1;
                else if(ch=='*')
                    ans=num2*num1;
                else if(ch=='÷')
                    ans=num2/num1;
                st.push(ans);
            }
        }
        return st.peek();
    }
    static void evaluate_expression(String exp){
        if(exp.contains("%")){
            int p=exp.indexOf('%');
            int num1=Integer.parseInt(exp.substring(0,p));
            int num2=Integer.parseInt(exp.substring(p+1));
            double res=(double)(num1*num2)/100;
            expression=String.valueOf(res);
            return;
        }
        if(exp.contains("^")){
            int p=exp.indexOf('^');
            int num1=Integer.parseInt(exp.substring(0,p));
            int num2=Integer.parseInt(exp.substring(p+1));
            double res=Math.pow(num1,num2);
            expression=String.valueOf(res);
            return;
        }
        String postfix=convert(exp);
        int res=evaluate_postfix(postfix);
        expression=String.valueOf(res);
    }
    static void evaluate_reciprocal(String exp){
        int x=Integer.parseInt(exp);
        double res=(double)1/x;
        expression=String.valueOf(res);
    }
    static void evaluate_root(String exp){
        int x=Integer.parseInt(exp);
        double res=Math.sqrt(x);
        expression=String.valueOf(res);
    }
}

public class MainCalculator{
    int a=0;
    public static void main(String args[]){
        Frame f=new Frame();
        f.setTitle("All-Purpose Calculator");
        Label lb=new Label("Welcome to All Purpose Calculator");
        Font font1 = new Font(Font.SERIF, Font.BOLD, 16);
        Font font2 = new Font(Font.SERIF, Font.BOLD, 15);
        lb.setFont(font1);
        lb.setBounds(50,50,250,30);
        f.add(lb);
        Button b1=new Button("Standard Calculator");  
        Button b2=new Button("Scientific Calculator");
        Button b3=new Button("Programmer Calculator");
        b1.setBounds(100,105,145,45);
        b2.setBounds(100,150,145,45);
        b3.setBounds(90,195,165,45);
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                StandardCalculator obj=new StandardCalculator();
                obj.standard_calculator();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                ScientificCalculator obj=new ScientificCalculator();
                obj.scientific_calculator();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                ProgrammerCalculator obj=new ProgrammerCalculator();
                obj.programmer_calculator();
            }
        });
        //To change the size of each component if not then the components will occupy all the spaces in th frame
        f.setLayout(null);
        //Setting the size
        f.setSize(330,370);
        //Set the visibility on
        f.setVisible(true);
    }
}
