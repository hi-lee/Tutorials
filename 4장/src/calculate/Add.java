package calculate;

class Add {
	int anInt;
	int bnInt;

	public Add() {
	}

	public Add(int anInt, int bnInt) {
		this.anInt = anInt;
		this.bnInt = bnInt;
	}

	int calc(int anInt, int bnInt) {
		return anInt + bnInt;
	}

	int calc() {
		return anInt + bnInt;
	}
}
