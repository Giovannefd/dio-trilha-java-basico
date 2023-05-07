
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual ? " + smartTv.canal);
		System.out.println("Volume Atual ? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status ? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Novo volume ? " + smartTv.volume);
		
		smartTv.mudarCanal(13);
		System.out.println("Novo canal ? " + smartTv.canal);

	}

}
