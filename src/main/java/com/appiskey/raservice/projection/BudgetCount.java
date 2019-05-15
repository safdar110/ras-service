package com.appiskey.raservice.projection;

import lombok.Data;


import java.io.Serializable;


public interface BudgetCount{
Double getTotalRevenue();
 Double getTotalExpense();
 Double getTotalBudget();
}
