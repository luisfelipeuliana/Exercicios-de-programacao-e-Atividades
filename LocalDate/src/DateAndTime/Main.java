package DateAndTime;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Main {
	public static void main(String args[]){
		/*
		 * serve tanto para dia da semana tanto mes
		DayOfWeek diaSemana = DayOfWeek.SATURDAY.plus(5);	
		Locale locale = Locale.getDefault();
		System.out.println(diaSemana.getDisplayName(TextStyle.FULL, locale ));
		System.out.println(diaSemana.getDisplayName(TextStyle.NARROW, locale ));
		System.out.println(diaSemana.getDisplayName(TextStyle.SHORT, locale ));
		*/
		/*
		LocalDate meuAniversario = LocalDate.of(2015,Month.JUNE,3);
		//proximo sabado apos meu aniversario
		LocalDate proximoSabado = meuAniversario.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(proximoSabado);
		*/
		/*
		//Ano e mes
		YearMonth anoEMes = YearMonth.now();
		System.out.println(anoEMes);
		System.out.println(anoEMes.lengthOfMonth());//dias no mes
		System.out.println(anoEMes.lengthOfYear());//dias no ano
		*/
		/*
		//mes e dia
		MonthDay mesDia = MonthDay.of(Month.FEBRUARY,29);
		MonthDay mesDiaAtual = MonthDay.now();
		System.out.println(mesDiaAtual);
		System.out.println(mesDia+"  verdadeiro se a data existir e falso se nao== "+mesDia.isValidYear(2015));
		*/
		
		/*
		//data e hora
		LocalDateTime atual = LocalDateTime.now();
		System.out.println(atual);
		//adicionando um ano na data atual
		System.out.println(atual.plusYears(1));
		//subtraindo 5 meses
		System.out.println(atual.minusMonths(5));
		*/
		/*
		//exemplo de parse data e formatar uma data 
		String data="20150603";
		LocalDate aniversario = LocalDate.parse(data,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(aniversario);
		
		String stringData = "09/12/2014";
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate sData = LocalDate.parse( stringData , fmt2 );
		
		*
		*
		*/
		
		/*
		//idade de uma pessoa
		int idade = Period.between(LocalDate.of(1995, Month.JUNE, 03), LocalDate.now()).getYears();
		System.out.println(idade);
		*/
		/*
		//formatando uma data
		LocalDate hoje = LocalDate.now();
		String hojeformat = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(hojeformat);

		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
}
