<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>text</th>
        <th>created by</th>
        <th>created</th>
        <th>updated by</th>
        <th>updated</th>
        <th>actions</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${items}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td>${item.text}</td>
            <g:if test="${item.createdBy != null}">
                <td>${item.createdBy.code}</td>
            </g:if>
            <g:else>
                <td>Unknown</td>
            </g:else>
            <td>${item.created}</td>
            <g:if test="${item.updatedBy != null}">
                <td>${item.updatedBy.code}</td>
            </g:if>
            <g:else>
                <td></td>
            </g:else>
            <td>${item.updated}</td>
            <td>
                <div class="buttons">
                    <g:link class="edit" action="actionShowDetail" params="[id:item.id]">Edit</g:link>
                    <g:remoteLink class="delete" action="actionRemoveDetail" params="[id:item.id]" update="itemsTableContainer" >Remove</g:remoteLink>

                </div>

            </td>
        </tr>
    </g:each>
    </tbody>
</table>