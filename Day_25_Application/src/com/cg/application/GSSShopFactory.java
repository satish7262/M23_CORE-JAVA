package com.cg.application;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNum, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(AccNo ,accNum ,charges,isPrime);
		return p;
	}

	




	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNum, float charges, boolean deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

}
