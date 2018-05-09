} catch(TheCheckedException e) {
    throw new AssertionError();  // 이런 일이 생길 리 없어요!
}



} catch(TheCheckedException e) {
    e.printStackTrace();         // 그래요. 졌습니다.
    System.exit(1);
}
