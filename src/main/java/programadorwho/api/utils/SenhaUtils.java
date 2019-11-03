package programadorwho.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	public static String gerarBCrypt(String senha) {

		if (senha == null) {
			return senha;
		}

		BCryptPasswordEncoder bCryptencoder = new BCryptPasswordEncoder();
		return bCryptencoder.encode(senha);

	}

	public static boolean senhaValida(String senha, String senhaEncider) {
		BCryptPasswordEncoder bCryptencoder = new BCryptPasswordEncoder();
		return bCryptencoder.matches(senha, senhaEncider);
	}

}
