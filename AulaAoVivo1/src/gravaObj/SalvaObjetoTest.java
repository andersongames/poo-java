package gravaObj;

import java.util.Arrays;
import java.util.EnumSet;

public class SalvaObjetoTest {

	public static void main(String[] args) {
		//Cria o objeto
		Cidade cidade = new Cidade("Curitiba", -25.2547, -49.1619, 1893997, false,
				Arrays.asList("Parques", "Teatro Guaíra", "Ópera dpe Arame", "Capital Ecológica do Brasil"),
				new Bairro[] {
					new Bairro("Batel", false, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
						Bairro.Qualidade.COMERCIAL, Bairro.Qualidade.TURISMO)),
					new Bairro("Atuba", true, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
						Bairro.Qualidade.COMERCIAL)),
					new Bairro("Centro", true, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
						Bairro.Qualidade.COMERCIAL, Bairro.Qualidade.TURISMO)),
					new Bairro("Tingui", true, EnumSet.of(Bairro.Qualidade.TURISMO,
						Bairro.Qualidade.RESIDENCIAL)),
					new Bairro("Barigui", true, EnumSet.of(Bairro.Qualidade.TURISMO,
						Bairro.Qualidade.RESIDENCIAL))
				});
		//salva o objeto
		SalvaObjeto.salvar(cidade, "C:\\MeusRepositorios\\MeusProjetos\\poo-java\\Temp\\Cidade.sav");
	}
}