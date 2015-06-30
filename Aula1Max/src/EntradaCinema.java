import java.lang.reflect.GenericArrayType;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.JSpinner.DateEditor;
import javax.swing.text.DateFormatter;

public class EntradaCinema {
	private LocalDate dataFilme;
	private LocalTime horario;
	private int sala;
	private float valorBilhete;

	public EntradaCinema() {
	}

	public EntradaCinema(LocalDate dataFilme, LocalTime horario, int sala,
			float valorBilhete) {
		this.dataFilme = dataFilme;
		this.horario = horario;
		this.sala = sala;
		this.valorBilhete = valorBilhete;
	}

	public void calculaDesc(LocalDate data) {int idade = Period.between(LocalDate.of(data.getYear(), data.getMonth(),data.getDayOfMonth()), LocalDate.now()).getYears();
		if (idade < 12) {
			this.valorBilhete -= (valorBilhete * 0.50);
		}
	}
	public void calculaDesc(LocalDate data, String numeroCarteiraEstudante) {
		int idade = Period.between(
				LocalDate.of(data.getYear(), data.getMonth(),
						data.getDayOfMonth()), LocalDate.now()).getYears();
		if (idade >= 12 && idade <= 15) {
			this.valorBilhete -= (valorBilhete * 0.40);
		}
		if (idade >= 16 && idade <= 20) {
			this.valorBilhete -= (valorBilhete * 0.30);
		}
		if (idade > 20) {
			this.valorBilhete -= (valorBilhete * 0.20);
		}
	}

	public void calculaDescHorario(LocalTime time) {
		if(time.getHour()< 16 )
		{
		this.valorBilhete -= (valorBilhete * 0.10);
		}
	}

	public LocalDate getDataFilme() {
		return dataFilme;
	}

	public void setDataFilme(LocalDate dataFilme) {
		this.dataFilme = dataFilme;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public float getValorBilhete() {
		return valorBilhete;
	}

	public void setValorBilhete(float valorBilhete) {
		this.valorBilhete = valorBilhete;
	}
}
