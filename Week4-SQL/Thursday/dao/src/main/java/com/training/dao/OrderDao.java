package com.training.dao;

import com.training.domain.CustomerOrder;
import com.training.domain.OrderLine;
import java.util.List;

public interface OrderDao {
    long createOpenOrder(String customerEmail) throws Exception;

    void addLine(long orderId, int lineNo, long productId, int qty, double unitPrice) throws Exception;

    void markPaid(long orderId) throws Exception;

    double computeOrderTotal(long orderId) throws Exception;

    List<OrderLine> linesFor(long orderId) throws Exception;

    CustomerOrder findOrder(long orderId) throws Exception;
}
