import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formata data
		DateTimeFormatter fmtH = DateTimeFormatter.ofPattern("HH:mm");//formata hora
		EntradaCinema entrada = new EntradaCinema();//objeto
		entrada.setValorBilhete(100);//valor do bilhete
		entrada.setSala(10);//sala do filme
	String horaFilme ="15:30";//hora do filme
	entrada.setHorario(LocalTime.parse(horaFilme));
	String dataFilme = "15/02/2015";//data do filme
	entrada.setDataFilme(LocalDate.parse(dataFilme,fmt2));
	
		String dataaniversario = "09/12/2005";
		LocalDate aniversario = LocalDate.parse(dataaniversario, fmt2);//transforma a string em data
		entrada.calculaDesc(aniversario);
		System.out.println(entrada.getValorBilhete());
		entrada.calculaDescHorario(entrada.getHorario());
		System.out.println(entrada.getValorBilhete());
		Cliente clit = new Cliente();
		System.out.println(clit);
		
	}

}
