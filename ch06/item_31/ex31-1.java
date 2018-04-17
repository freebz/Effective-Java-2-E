// ordinal을 남용한 사례 - 따라하면 곤란
public enum Ensemble {
    SOLE, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() { return ordinal() + 1; }
}
