public static BigInteger safeInstance(BigInteger val) {
    if (val.getClass() != BigInteger.class)
	return new BigInteger(val.toByteArray());
    return val;
}
