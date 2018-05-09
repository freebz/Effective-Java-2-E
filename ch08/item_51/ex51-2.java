public String statement() {
    StringBuilder b = new StringBuilder(numITems() * LINE_WIDTH);
    for (int i = 0; i < numItems(); i++)
	b.append(lineForItem(i));
    return b.toString();
}
