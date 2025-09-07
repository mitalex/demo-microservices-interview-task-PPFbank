package org.acme.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.TransactionDto;
import org.acme.mapper.TransactionMapper;
import org.acme.model.Transaction;
import org.acme.repository.TransactionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Path("/accounts")
public class TransactionResource {

    @Inject
    TransactionRepository transactionRepository;

    @GET
    @Path("/{accountNumber}/transactions")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TransactionDto> getTransactions(@PathParam("accountNumber") String accountNumber) {
        List<Transaction> transactions = transactionRepository.findByAccountNumber(accountNumber);
        return transactions.stream()
                .map(TransactionMapper::toDto)
                .collect(Collectors.toList());
    }
}
