package br.com.encrytion;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Encryption {

	protected EncryptionType type;

	protected String plainText;

	protected BigInteger cipher;

	protected int baseHash = 16;

	private MessageDigest messageDigest;

	private BigInteger encryptedText;

	Map<EncryptionType, String> types = new HashMap<EncryptionType, String>();

	public Encryption(EncryptionType type, String plainText) throws NoSuchAlgorithmException {
		this.type = type;
		this.plainText = plainText;

		types.put(EncryptionType.MD5, "MD5");
		types.put(EncryptionType.SHA1, "SHA-1");
		types.put(EncryptionType.SHA256, "SHA-256");

		process();
	}

	public Encryption(EncryptionType type, String plainText, int baseHash) throws NoSuchAlgorithmException {
		this.type = type;
		this.plainText = plainText;

		this.baseHash = baseHash;

		types.put(EncryptionType.MD5, "MD5");
		types.put(EncryptionType.SHA1, "SHA-1");
		types.put(EncryptionType.SHA256, "SHA-256");

		process();
	}

	private void process() throws NoSuchAlgorithmException {

		messageDigest = MessageDigest.getInstance(types.get(type));

		messageDigest.update(plainText.getBytes(), 0, plainText.length());

		encryptedText = new BigInteger(1, this.messageDigest.digest());
	}

	public String getEncryptedText() {
		return encryptedText.toString(baseHash);
	}

}