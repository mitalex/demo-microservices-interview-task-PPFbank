package org.acme.mapper;

import org.acme.dto.AmountDto;
import org.acme.dto.CounterPartyAccountDto;
import org.acme.dto.DetailsDto;
import org.acme.dto.TransactionDto;
import org.acme.model.Transaction;

public class TransactionMapper {

    public static TransactionDto toDto(Transaction entity) {
        TransactionDto dto = new TransactionDto();
        dto.setAmount(new AmountDto(entity.getCurrency(), entity.getAmount()));
        dto.setBankref(entity.getBankref());
        dto.setBookingDate(entity.getBookingDate());
        dto.setCounterPartyAccount(new CounterPartyAccountDto(
                entity.getCounterPartyAccount().getName(),
                entity.getCounterPartyAccount().getNumber(),
                entity.getCounterPartyAccount().getCode()
        ));
        dto.setCreditDebitIndicator(entity.getCreditDebitIndicator());
        dto.setDetails(new DetailsDto(entity.getDetail1()));
        dto.setId(entity.getId());
        dto.setOwnAccountNumber(entity.getOwnAccountNumber());
        dto.setPostingDate(entity.getPostingDate());
        dto.setProductBankRef(entity.getProductBankRef());
        dto.setSpecificSymbol(entity.getSpecificSymbol());
        dto.setStatementNumber(entity.getStatement().getNumber());
        dto.setStatementPeriod(entity.getStatement().getPeriod());
        dto.setTransactionId(entity.getTransactionId());
        dto.setTransactionType(entity.getTransactionType().getType());
        dto.setTransactionTypeCode(entity.getTransactionType().getCode());
        dto.setVariableSymbol(entity.getVariableSymbol());
        return dto;
    }
}
