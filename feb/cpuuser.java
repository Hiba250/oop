package MODULE_1;

public class Cpu {
	double price;
	class processor {
		double cores;
			String manufacturer;
			double getCache() {
				return 4.3;}}
	static class RAM{
		double memory;
		String manufacturer;
		double  getClockspeed() {
			return 5.5;}}}
		
		
package MODULE_1;
import java.util.Scanner;

public class CpuDetails {


	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Cpu cpu = new Cpu();
		System.out.print("enter processor cache size:");
		String procrssorCache = scanner.nextLine();
		System.out.print("enter RAM clock speed:");
		String ramClockspeed = scanner.nextLine();
		Cpu.processor processor = cpu.new processor();
		Cpu.RAM ram = new Cpu.RAM();
		System.out.println("processor Cache=" + processor.getCache());
		System.out.println("RAM Clock speed =" + ram.getClockspeed() );
		scanner.close();}}

output
  
enter processor cache size:4
enter RAM clock speed:5
processor Cache=4.3
RAM Clock speed =5.5
  
