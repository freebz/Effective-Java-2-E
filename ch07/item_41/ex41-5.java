for (int i = 0; i < 3; i++) {
    set.remove(i);
    list.remove((Integer) i);  // 아니면 remove(Integer.valueOf(i))
}
