package com.project.chainCommand;

import com.project.entity.PurchaseRequest;

public class ServiceComptable extends POService{

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        // handle PurchaseRequest
        // Step 1 ==> Verify Amount
        if(purchaseRequest.getDepartment().canPurchase(purchaseRequest.getGlobalAmount())){
            // Block amount in Department
            purchaseRequest.getDepartment().setBlockedBudget(purchaseRequest.getGlobalAmount());
            System.out.println("First Step Done ==> " + purchaseRequest.getDepartment().toString());
            // Pass to the next Service
            this.nextService.handlePurchaseRequest(purchaseRequest);
        }
        else{
            System.out.println("Amount of Purchase request exceeds the budget of Department ==> Operation Denied");
        }
    }
}
