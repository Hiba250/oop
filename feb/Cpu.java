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

public class CpuDetails {


	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		Cpu.processor processor = cpu.new processor();
		Cpu.RAM ram = new Cpu.RAM();
		System.out.println("processor Cache=" + processor.getCache());
		System.out.println("RAM Clock speed =" + ram.getClockspeed() );}}

output

processor Cache=4.3
RAM Clock speed =5.5
