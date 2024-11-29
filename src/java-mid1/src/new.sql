



<update id="updateReportStatus" parameterType="map">
    UPDATE report
    SET
        repo_status = #{status},
            cancel_comment = #{rejectionReason}
            <if test="status == 'submitted'">
                , submission_date = NOW()
            </if>
            <if test="status == 'rejected'">
                , cancel_date = NOW()
            </if>
    WHERE repo_no = #{reportId}
</update>



