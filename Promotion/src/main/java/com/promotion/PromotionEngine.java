package com.promotion;

public class PromotionEngine {

	public static int promotionCost(int qtyA, int qtyB, int qtyC, int qtyD) {
		int priceA = 0;
		int priceB = 0;
		int priceC = 0;
		int priceD = 0;
		int priceCD = 0;

		if (qtyA % 3 == 0) {
			priceA = (qtyA / 3) * Engine.promotion_3A.getValue();
		} else if (qtyA % 3 != 0) {
			priceA = (qtyA / 3) * Engine.promotion_3A.getValue() + ((qtyA % 3) * Engine.unitA.getValue());
		}

		if (qtyB % 2 == 0) {
			priceB = (qtyB / 2) * Engine.promotion_2B.getValue();
		} else if (qtyB % 2 != 0) {
			priceB = (qtyB / 2) * Engine.promotion_2B.getValue() + ((qtyB % 2) * Engine.unitB.getValue());
		}
		if (qtyC == qtyD) {
			priceCD = qtyC * Engine.promotion_CD.getValue();
			priceC = 0;
			priceD = 0;
		} else if (qtyC > qtyD) {
			priceCD = qtyD * Engine.promotion_CD.getValue();
			priceC = qtyC * Engine.unitC.getValue();
			priceD = 0;
		} else if (qtyC < qtyD) {
			priceCD = qtyC * Engine.promotion_CD.getValue();
			priceD = qtyD * Engine.unitD.getValue();
			priceC = 0;
		}

		int totalPrice = priceA + priceB + priceC + priceD + priceCD;
		return totalPrice;
	}

}
