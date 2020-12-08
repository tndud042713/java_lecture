import java.io.IOException;

public class ProcessCall {
	public static void main(String[] args) throws IOException{
		ProcessBuilder oProcess = new ProcessBuilder("C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe");
		oProcess.start();
	}
}
